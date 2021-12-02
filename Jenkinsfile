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
            			    sh 'mvn compile'
            			}
		                }
		                 stage('Package'){
            			steps{
            			    
            			    sh 'mvn package'
            			}
		                }
		                 stage('Deploy'){
            			steps{
            			    sh 'java -jar /var/lib/jenkins/workspace/Ebug/target/*.jar'
            			}
		                }
	                }
}
	                
