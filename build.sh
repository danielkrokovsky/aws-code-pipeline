versao=$(git rev-parse HEAD  | cut -c 1-7)
ECR_REGISTRY=563748388618.dkr.ecr.us-east-1.amazonaws.com
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin $ECR_REGISTRY
docker build -t bia .
docker tag bia:latest $ECR_REGISTRY/bia:$versao
docker push $ECR_REGISTRY/bia:$versao
rm .env
rm bia-versao-*.zip
./gerar-compose.sh
zip -r bia-versao-$versao.zip docker-compose.yml
rm docker-compose-dev.yml