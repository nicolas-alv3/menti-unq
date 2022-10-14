sudo mvn clean install -DskipTests
sudo mvn package
sudo docker build -t  mentiunq .
sudo docker compose down
sudo docker compose up