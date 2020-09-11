node ("Pipeline") {
  stage ('Build') {

    git url: 'https://github.com/Michrian/vdm'

    withMaven(
        // Maven installation declared in the Jenkins "Global Tool Configuration"
        maven: 'maven-3', // (1)
        // Use `$WORKSPACE/.repository` for local repository folder to avoid shared repositories
        mavenLocalRepo: '.repository', // (2)
        mavenSettingsConfig: 'my-maven-settings' // (3)
    ) {

      // Run the maven build
      sh "mvn clean verify"

    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs & SpotBugs reports...
  }
}
