sudo mvn clean install -DskipTests
sudo mvn package -DskipTests
sudo docker build -t  mentiunq -f /docker/Dockerfile .
sudo docker compose down
sudo docker compose up