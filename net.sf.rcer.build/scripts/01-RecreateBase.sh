#!/bin/bash
#
# Script to (re)create the contents of the base installation.
#

export ECLIPSE="eclipse-SDK-3.4.1-linux-gtk.tar.gz"
export OAW="org.openarchitectureware.sdk.feature-4.3.1.20090107-2000PRD.zip"
export JCO="com.sap.conn.jco_7.11.0.jar"

if [ "x${RCER_BUILD_HOME}" = "x" ] ; then
  echo Environment variable RCER_BUILD_HOME is not set.
  exit 1
fi 

if [ ! -f ${RCER_BUILD_HOME}/distfiles/${ECLIPSE} ] ; then 
	echo ${RCER_BUILD_HOME}/distfiles/${ECLIPSE} is missing. Download the file and re-run this script.
	exit -1
fi

if [ ! -f ${RCER_BUILD_HOME}/distfiles/${OAW} ] ; then
	echo ${RCER_BUILD_HOME}/distfiles/${OAW} is missing. Download the file and re-run this script.
	exit -1
fi

if [ ! -f ${RCER_BUILD_HOME}/distfiles/${JCO} ] ; then
	echo ${RCER_BUILD_HOME}/distfiles/${JCO} is missing. Generate and export the plug-in, then re-run this script.
	exit -1
fi

echo "Deleting old installation..."
mkdir -p ${RCER_BUILD_HOME}/base
rm -rf ${RCER_BUILD_HOME}/base/*
cd ${RCER_BUILD_HOME}/base

echo "Extracting Eclipse SDK..."
tar xzf ${RCER_BUILD_HOME}/distfiles/${ECLIPSE}

echo "Extracting openArchitectureWare SDK..."
unzip -q -f ${RCER_BUILD_HOME}/distfiles/${OAW}

echo "Adding JCo..."
cp ${RCER_BUILD_HOME}/distfiles/${JCO} ${RCER_BUILD_HOME}/base/plugins/
echo "OK."