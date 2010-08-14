#!/bin/bash
#
# Script to update the website and the update site
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

if [ "x${RCER_SF_USER}" = "x" ] ; then
  echo Environment variable RCER_SF_USER is not set.
  exit 1
fi 

echo "Creating zipped distribution package..."
mkdir -p ${RCER_BUILD_HOME}/website/dist
rm -rf ${RCER_BUILD_HOME}/website/dist/*
cp -r ${RCER_BUILD_HOME}/build/site/features ${RCER_BUILD_HOME}/website/dist/
cp -r ${RCER_BUILD_HOME}/build/site/plugins ${RCER_BUILD_HOME}/website/dist/
cd ${RCER_BUILD_HOME}/website/dist/
zip -r rcer-current.zip features plugins

echo "Exporting static content from repository..."
mkdir -p ${RCER_BUILD_HOME}/website/src
rm -rf ${RCER_BUILD_HOME}/website/src/*
cd ${RCER_BUILD_HOME}/website/src
svn_export net.sf.rcer.website

echo "Preparing the staging area..."
mkdir ${RCER_BUILD_HOME}/website/staging
mkdir ${RCER_BUILD_HOME}/website/staging/update-site
cp -r ${RCER_BUILD_HOME}/website/src/net.sf.rcer.website/* ${RCER_BUILD_HOME}/website/staging/
cp -r ${RCER_BUILD_HOME}/build/site/* ${RCER_BUILD_HOME}/website/staging/update-site
cp ${RCER_BUILD_HOME}/website/dist/rcer-current.zip ${RCER_BUILD_HOME}/website/staging/


echo "Updating the website..."
rsync -avP -e ssh ${RCER_BUILD_HOME}/website/staging/* ${RCER_SF_USER},rcer@web.sourceforge.net:htdocs/
