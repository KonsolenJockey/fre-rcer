#!/bin/bash
#
# Script to (re)create the contents of the base installation.
#
# $Id$
#

export ECLIPSE="eclipse-modeling-galileo-SR1-incubation-linux-gtk.tar.gz"
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
check_distfile ${JCO}

echo "Deleting old installation..."
mkdir -p ${RCER_BUILD_HOME}/base
rm -rf ${RCER_BUILD_HOME}/base/*
cd ${RCER_BUILD_HOME}/base

echo "Extracting Eclipse SDK..."
tar xzf ${RCER_BUILD_HOME}/distfiles/${ECLIPSE}

echo "Adding JCo..."
cp ${RCER_BUILD_HOME}/distfiles/${JCO} ${RCER_BUILD_HOME}/base/eclipse/plugins/
echo "OK."