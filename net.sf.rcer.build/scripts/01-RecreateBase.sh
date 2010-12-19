#!/bin/bash
#
# Script to (re)create the contents of the base installation.
#
# $Id$
#

export ECLIPSE="eclipse-modeling-helios-SR1-incubation-linux-gtk.tar.gz"
export JCO="com.sap.conn.jco_7.11.0.jar"
export MWE="emft-mwe-SDK-1.0.1.zip"      
export MWE2="emft-mwe-2-SDK-1.0.1.zip"        
export MWE2LANG="emft-mwe-2-lang-SDK-1.0.1.zip"                        
export XPAND="m2t-xpand-SDK-1.0.1.zip"                                                 
export XTEXT="tmf-xtext-SDK-1.0.1.zip" 

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

echo "Adding MWE..."
unzip -n -q ${RCER_BUILD_HOME}/distfiles/${MWE}
unzip -n -q ${RCER_BUILD_HOME}/distfiles/${MWE2}
unzip -n -q ${RCER_BUILD_HOME}/distfiles/${MWE2LANG}

echo "Adding Xpand / Xtend..."
unzip -n -q ${RCER_BUILD_HOME}/distfiles/${XPAND}

echo "Adding Xtext..."
unzip -n -q ${RCER_BUILD_HOME}/distfiles/${XTEXT}

echo "OK."