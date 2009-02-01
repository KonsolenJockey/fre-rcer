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
rm -rf ${RCER_BUILD_HOME}/export/features/*
rm -rf ${RCER_BUILD_HOME}/export/plugins/*

cd ${RCER_BUILD_HOME}/export/features
svn_export net.sf.rcer
svn_export net.sf.rcer.sdk
svn_export net.sf.rcer.import

cd ${RCER_BUILD_HOME}/export/plugins
svn_export net.sf.rcer.conn
svn_export net.sf.rcer.conn.ui
svn_export net.sf.rcer.example.rfcgen.call
svn_export net.sf.rcer.example.rfcgen.rr
svn_export net.sf.rcer.example.traditional
svn_export net.sf.rcer.jcoimport
svn_export net.sf.rcer.rfcgen
svn_export net.sf.rcer.rfcgen.editor
svn_export net.sf.rcer.rfcgen.generator

echo "OK."