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

    }

}
