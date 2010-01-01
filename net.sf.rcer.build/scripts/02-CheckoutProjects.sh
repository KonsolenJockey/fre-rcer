#!/bin/bash
#
# Script to export the projects from the source code repository.
#
# $Id$
#

svn_export() {
	echo "Exporting project ${1}..."
	svn -q export https://rcer.svn.sourceforge.net/svnroot/rcer/trunk/${1}
}

if [ "x${RCER_BUILD_HOME}" = "x" ] ; then
  echo Environment variable RCER_BUILD_HOME is not set.
  exit 1
fi 

echo "Deleting old contents..."
mkdir -p ${RCER_BUILD_HOME}/export/features
mkdir -p ${RCER_BUILD_HOME}/export/plugins
mkdir -p ${RCER_BUILD_HOME}/website
rm -rf ${RCER_BUILD_HOME}/export/features/*
rm -rf ${RCER_BUILD_HOME}/export/plugins/*
rm -rf ${RCER_BUILD_HOME}/website/*

cd ${RCER_BUILD_HOME}/export/features
svn_export net.sf.rcer
svn_export net.sf.rcer.sdk
svn_export net.sf.rcer.import

cd ${RCER_BUILD_HOME}/export/plugins
svn_export net.sf.rcer.conn
svn_export net.sf.rcer.conn.doc
svn_export net.sf.rcer.conn.ui
svn_export net.sf.rcer.cts
svn_export net.sf.rcer.cts.ui
svn_export net.sf.rcer.doc
svn_export net.sf.rcer.example.rfcgen.pojo.call
svn_export net.sf.rcer.example.rfcgen.pojo.rr
svn_export net.sf.rcer.example.traditional
svn_export net.sf.rcer.jcoimport
svn_export net.sf.rcer.jcoimport.doc
svn_export net.sf.rcer.rfcgen
svn_export net.sf.rcer.rfcgen.doc
svn_export net.sf.rcer.rfcgen.generator
svn_export net.sf.rcer.rfcgen.ui
svn_export net.sf.rcer.rom
svn_export net.sf.rcer.sdk.doc

mkdir ${RCER_BUILD_HOME}/website/src
cd ${RCER_BUILD_HOME}/website/src
svn_export net.sf.rcer.website

echo "OK."