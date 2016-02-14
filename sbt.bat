set SCRIPT_DIR=%~dp0
java -Xss2M -Xms512M -Xmx2312M -XX:+UseG1GC -XX:+CMSClassUnloadingEnabled -Dsbt.ivy.home=%SCRIPT_DIR%bin\ivy-home -Dsbt.boot.directory=%SCRIPT_DIR%bin\sbt-boot -Dsbt.global.base=%SCRIPT_DIR%bin\sbt-home -jar "%SCRIPT_DIR%\bin\sbt-launch-0.13.9.jar" %*
