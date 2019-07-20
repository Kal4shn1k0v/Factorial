@echo ON
c:\
cd /D "%~dp0"
start /w gradlew.bat setupDecompWorkspace
call gradlew.bat eclipse 
pause