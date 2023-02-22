pipeline {
    agent any
    stages{
        stage("Clean up"){
            steps{
                deleteDir()
            }
        }
		stage("Clone"){
		    steps{
		        bat "git clone https://github.com/Marknewcomb/OOAD.git"
		    }

		}
		stage("Build"){
		    steps{
		        dir("OOAD"){
		            bat "mvn clean install"
		        }

		    }

		}
		stage("Run Jar"){
		    steps{
		        dir("OOAD"){
		            bat "java -cp target/OOAD-0.0.1-SNAPSHOT-jar-with-dependencies.jar com.newcomb.java.Main"
		        }

		    }

		}
		stage("Push to Docker"){
		                steps{
		                    dir("OOAD"){
		                        bat "docker build -t ooad ."
		                        bat "docker login -u mnewcomb21 -p 196711aaAA!!"
		                        bat "docker tag ooad mnewcomb21/ooad"
		                        bat "docker push mnewcomb21/ooad"
		                    }

		                }

		            }

    }

}
