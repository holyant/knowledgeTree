
###错误情况
git add *
fatal: CRLF would be replaced by LF in out/production/MyUtil/applicationContext.xml.

###解决
git config --global core.autocrlf false