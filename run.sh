#!/bin/bash
# Script to run the hexagonal architecture application with a specific profile

# Check if a profile is provided
if [ $# -eq 0 ]; then
    echo "Usage: $0 <profile> (e.g., dev, test, prod)"
    exit 1
fi

# Run the application with the provided profile
cd code/api
mvn spring-boot:run -Dspring-boot.run.profiles=$1 