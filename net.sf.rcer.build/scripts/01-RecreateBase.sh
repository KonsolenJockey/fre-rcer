#!/bin/bash
#
# Script to (re)create the contents of the base installation.
#

export ECLIPSE="eclipse-SDK-3.4.1-linux-gtk.tar.gz"
export EMF="emf-sdo-xsd-SDK-2.4.1.zip"
export OAW="org.openarchitectureware.sdk.feature-4.3.1.20090107-2000PRD.zip"
export JCO="com.sap.conn.jco_7.11.0.jar"

check_distfile() {
	if [ ! -f ${RCER_BUILD_HOME}/distfiles/${1} ] ; then 
		echo ${RCER_BUILD_HOME}/distfiles/${1} is missing. Download the file and re-run this script.
		exit -1
	fi
}


if [ "x${RCER_BUILD_HOME}" = "x" ] ; then
  echo Environment variable RCER_BUILD_HOME is not set.
  exit 1
fi 

check_distfile ${ECLIPSE} 
check_distfile ${EMF} 
check_distfile ${OAW}
check_distfile ${JCO}

echo "Deleting old installation..."
mkdir -p ${RCER_BUILD_HOME}/base
rm -rf ${RCER_BUILD_HOME}/base/*
cd ${RCER_BUILD_HOME}/base

echo "Extracting Eclipse SDK..."
tar xzf ${RCER_BUILD_HOME}/distfiles/${ECLIPSE}

echo "Extracting EMF SDK..."
unzip -q -o ${RCER_BUILD_HOME}/distfiles/${EMF}

echo "Extracting openArchitectureWare SDK..."
unzip -q -o ${RCER_BUILD_HOME}/distfiles/${OAW}

echo "Adding JCo..."
cp ${RCER_BUILD_HOME}/distfiles/${JCO} ${RCER_BUILD_HOME}/base/eclipse/plugins/
echo "OK."