pipeline{
agent any

		stages {
			stage('Verify Branch'){
			steps{
			echo "@GIT_BRANCH"
			
			}
			}
            			stage('Checkout'){
            			steps{
            			    git branch: 'main', url: 'https://github.com/pjptl/Ebugtracker-main.git'
            			}
		                }
			stage('Build'){
            			steps{
            			    bat 'mvn compile'
            			}
		                }
			stage('Package'){
				steps{
				   bat 'mvn package'
				      }
                                     }
			stage('Deploy'){
                                steps{
                                    bat 'java -jar C:/ProgramData/Jenkins/.jenkins/workspace/BuildEbug/target/ebugtracker-casestudy-0.0.1-SNAPSHOT.jar'
                        }
                        }
			
		                 
		                
	                }
}
	                
