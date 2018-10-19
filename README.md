# spring-cloud-contract-git
An isolatd repo for SCC Contracts

## How to update stubs?

mvn clean package -DskipTests -Dstubrunner.properties.git.username=USER -Dstubrunner.properties.git.password=PASSWORD

