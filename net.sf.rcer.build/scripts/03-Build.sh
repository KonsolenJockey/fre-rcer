#!/bin/bash
#
# Script to run the PDE build.
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

echo "Launching antRunner..."
cd ${RCER_BUILD_HOME}/build
java -jar ${RCER_BUILD_HOME}/base/eclipse/plugins/org.eclipse.equinox.launcher_1.0.101.R34x_v20080819.jar \
     -application org.eclipse.ant.core.antRunner \
     -buildfile ${RCER_BUILD_HOME}/base/eclipse/plugins/org.eclipse.pde.build_3.4.1.R34x_v20080805/scripts/build.xml \
     -Dbuilder=${RCER_BUILD_HOME}/config \
     -Dbase=${RCER_BUILD_HOME}/base \
     -DbuildDirectory=${RCER_BUILD_HOME}/build \
     2>&1 | tee ${RCER_BUILD_HOME}/build/RCER-Build.log