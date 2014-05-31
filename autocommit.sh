#!/bin/bash
# Auto Commit Script Created for FergoUtil
while true; do
CDATE=`date`
CHOST=`hostname`

COMMITMESSAGE="Auto Commit - ${CDATE} (${CHOST})"

echo "==== Starting Commit with Message: ${COMMITMESSAGE}"

git pull origin master

# Add all code
git add --all

# Commit
git commit -m "$COMMITMESSAGE" --allow-empty # (Allow empty will push an empty commit)

# Push
git push --set-upstream origin master

echo "==== Auto Commit completed"
exit 2
done
