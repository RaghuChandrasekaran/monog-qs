# Mongo DB Quickstart and playground

## Generate SSL cert
`openssl req -newkey rsa:2048 -new -x509 -days 365 -nodes -out mongodb-cert.crt -keyout mongodb-cert.key`

## Import cert into keystore (default or cacerts)
`keytool -import -alias mongocert -keystore C:\Program Files\Java\jdk-9\lib\security\cacerts -file D:\Workspace\bat\mongodb.pem`

`keytool -import -alias mongocert -file D:\Workspace\bat\mongodb-cert.crt`

## Start mongo instance
`mongod --sslMode requireSSL --sslPEMKeyFile D:/Workspace/bat/mongodb.pem  --dbpath C:/data`

`mongo --ssl --sslCAFile D:/Workspace/bat/mongodb.pem`
