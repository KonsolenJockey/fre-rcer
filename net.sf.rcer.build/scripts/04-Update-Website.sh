#!/bin/bash
#
# Script to update the website and the update site
#
# $Id$
#

if [ "x${RCER_BUILD_HOME}" = "x" ] ; then
  echo Environment variable RCER_BUILD_HOME is not set.
  exit 1
fi 

if [ "x${RCER_SF_USER}" = "x" ] ; then
  echo Environment variable RCER_SF_USER is not set.
  exit 1
fi 

echo "Updating the website..."
rsync -avP -e ssh ${RCER_BUILD_HOME}/website/net.sf.rcer.website/* ${RCER_SF_USER},rcer@web.sourceforge.net:htdocs/

echo "Uploading the update site..."
rsync -avP -e ssh ${RCER_BUILD_HOME}/build/site/* ${RCER_SF_USER},rcer@web.sourceforge.net:htdocs/update-site/
