kubectl apply -f deployment.yaml
kubectl expose deployment hello-kubernetes --type=LoadBalancer --name=hello-kubernetes
