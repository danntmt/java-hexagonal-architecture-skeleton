# Core module directories
mkdir core/src/main/java/com/hexagonal/core/domain/valueobjects
mkdir core/src/main/java/com/hexagonal/core/domain/services
mkdir core/src/main/java/com/hexagonal/core/domain/repositories
mkdir core/src/test/java/com/hexagonal/core/domain

# Application module directories
mkdir application/src/main/java/com/hexagonal/application/commands
mkdir application/src/main/java/com/hexagonal/application/queries
mkdir application/src/main/java/com/hexagonal/application/handlers/commands
mkdir application/src/main/java/com/hexagonal/application/handlers/queries
mkdir application/src/test/java/com/hexagonal/application

# Infrastructure module directories
mkdir infrastructure/src/main/java/com/hexagonal/infrastructure/repositories
mkdir infrastructure/src/main/java/com/hexagonal/infrastructure/config
mkdir infrastructure/src/main/java/com/hexagonal/infrastructure/listeners
mkdir infrastructure/src/test/java/com/hexagonal/infrastructure

# API module directories
mkdir api/src/main/java/com/hexagonal/api/controllers
mkdir api/src/main/java/com/hexagonal/api/config
mkdir api/src/test/java/com/hexagonal/api 