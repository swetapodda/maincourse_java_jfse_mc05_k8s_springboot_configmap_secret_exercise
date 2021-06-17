## Exercise: Deploy a Spring Boot microservice which uses configmap and secret on a k8s cluster.  

* In this Exercise, you will deploy a Spring Boot microservice using configmap and secret on k8s cluster.  

This exercise contains following folders:

	- k8s - Contains manifest files, these files are explained below
	- SbService - A SpringBoot application

This exercise contains following files in k8s folder:

	- configmap.yml - To create ConfigMap
	- secret.yml - To create secret
	- mongodb.yml - To create the deployment, service of type ClusterIP for MongoDB
	- springboot.yml - To create the deployment, service of type NodePort for springboot application
	- ingress.yml - To create ingres

Understand and perform the following steps to complete this exercise:
	
	1. Modify the properties in `application.yml` of `SbService` following the comments given in the file. Push SbService image to Docker Hub.
	2. Follow the instructions given in the configmap.yml file, once done, run command `kubectl apply -f configmap.yml`.
	3. Follow the instructions given in the secret.yml file, once done, run command `kubectl apply -f secret.yml`.
	4. Follow the instructions given in the mongodb.yml file, once done, run command `kubectl apply -f mongodb.yml`.
	5. Follow the instructions given in the springboot.yml file, once done, run command `kubectl apply -f springboot.yml`.
	6. Follow the instructions given in the ingress.yml file, once done, run command `kubectl apply -f ingress.yml`.
	7. Test SpringBoot application is using ConfigMap data or not, open browser and check for `http://<minikube-ip>/message/your-name` url, you will be able to see the message.
	8. Test SpringBoot application is using secret data or not, open browser and check for `http://<minikube-ip>/getAll` url, you will be able to see an empty array.
	9. Add a person, open browser and check for `http://<minikube-ip>/create?email=<email-id>&name=<name>&age=<age>` url, you will be able to see added Person details, test `http://<minikube-ip>/getAll` url and you can view the list of persons.

### Instructions

- Take care of whitespace/trailing whitespace
- Do not change the provided code unless instructed
- Ensure your code compiles without any errors/warning/deprecations
- Follow best practices while coding