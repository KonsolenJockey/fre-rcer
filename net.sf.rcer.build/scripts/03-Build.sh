#!/bin/bash
#
# Script to run the PDE build.
#
# $Id$
#

if [ "x${RCER_BUILD_HOME}" = "x" ] ; then
  echo Environment variable RCER_BUILD_HOME is not set.
  exit 1
fi 

echo "Deleting old build directory contents..."
mkdir -p ${RCER_BUILD_HOME}/build
rm -rf ${RCER_BUILD_HOME}/build/*

echo "Copying projects to build directory..."
cp -R ${RCER_BUILD_HOME}/export/* ${RCER_BUILD_HOME}/build/ 

echo "Adding JCo..."
mkdir ${RCER_BUILD_HOME}/build/plugins/com.sap.conn.jco
cd ${RCER_BUILD_HOME}/build/plugins/com.sap.conn.jco
jar xf ${RCER_BUILD_HOME}/distfiles/com.sap.*.jar

echo "Generating Java Documentation..."
cd ${RCER_BUILD_HOME}/build/plugins/net.sf.rcer.sdk.doc
export ECLIPSE_HOME=${RCER_BUILD_HOME}/base/eclipse
ant -buildfile javadoc.xml 

echo "Launching antRunner..."
export LAUNCHER=`ls ${RCER_BUILD_HOME}/base/eclipse/plugins/org.eclipse.equinox.launcher_*.jar`
export BUILDFILEDIR=`ls -d ${RCER_BUILD_HOME}/base/eclipse/plugins/org.eclipse.pde.build_*`
cd ${RCER_BUILD_HOME}/build
java -jar ${LAUNCHER} \
     -application org.eclipse.ant.core.antRunner \
     -buildfile ${BUILDFILEDIR}/scripts/build.xml \
     -Dbuilder=${RCER_BUILD_HOME}/config \
     -Dbase=${RCER_BUILD_HOME}/base \
     -DbuildDirectory=${RCER_BUILD_HOME}/build \
     2>&1 | tee ${RCER_BUILD_HOME}/build/RCER-Build.log