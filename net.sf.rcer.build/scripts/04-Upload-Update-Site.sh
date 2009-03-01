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

if [ "x${RCER_SF_USER}" = "x" ] ; then
  echo Environment variable RCER_SF_USER is not set.
  exit 1
fi 

echo "Uploading the update site..."
rsync -avP -e ssh ${RCER_BUILD_HOME}/build/site/* ${RCER_SF_USER},rcer@web.sourceforge.net:htdocs/update-site/
