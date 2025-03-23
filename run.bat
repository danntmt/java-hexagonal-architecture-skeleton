@echo off
REM Script to run the hexagonal architecture application with a specific profile

REM Check if a profile is provided
if "%1"=="" (
    echo Usage: %0 ^<profile^> (e.g., dev, test, prod)
    exit /b 1
)

REM Run the application with the provided profile
cd code\api
mvn spring-boot:run -Dspring-boot.run.profiles=%1 