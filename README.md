# testFinalGitHub
1. Escribi gradle app y sus tests
![pomJUnit](https://user-images.githubusercontent.com/55667385/167526042-1cdd8dc2-baa4-4447-91ff-92f03622eff1.JPG)

2. Lo subi a github

3. Escribi el gradle.yml: hace el build, corre test, job de sonarcloud, job de artifacts, gitleaks y snyk. Unit Test y SonarCloud corren en paralelo, no secuencial
![runsInParallelEvidence2](https://user-images.githubusercontent.com/55667385/167526117-c090e94c-9bfe-47c3-a358-5737c5eaa1a2.JPG)

4. En sonarcloud setee el qualitygate. Agregue el job de sonarcloud
![conditionsInSonarCloud](https://user-images.githubusercontent.com/55667385/167526797-d6a71cb1-04f8-4cf2-a923-ad86ef57bc3f.JPG)

Y como deberia, frena el pipelina correctamente
![failsBecauseOfQualityGate](https://user-images.githubusercontent.com/55667385/167526223-18684af2-013f-4a0c-acfe-89579d198e2e.JPG)


5. En jfrog cree a mano el local, remoto y virtual. En el virtual inclui el local y el remoto. Set me up y segui los pasos. Me baje el gradle.properties(que tiene las variables de entorno que usa el build.gradle). Y agregue el job
![jfrogRepoVirtualEvidence](https://user-images.githubusercontent.com/55667385/167526307-df20af9d-b859-47f4-9139-d74e7a614c25.JPG)

6. gitleaks: googleando encontre el job que use.
![gitLeaksWorksEvidence](https://user-images.githubusercontent.com/55667385/167526346-c0b67a79-0066-4860-a65c-65e64b3c74a3.JPG)

7. snyk: googleando encontre el job que use.
8. Arregle vulnerabilidades encontradas por sonarCloud(Tests corregidos)
![sonarCloudPideAssertEqualsNoAssertTrue](https://user-images.githubusercontent.com/55667385/167526240-20195baa-0276-4442-b8e3-2ed158023978.JPG)

![testsFixed](https://user-images.githubusercontent.com/55667385/167526251-83d47e1a-0946-4d5a-baeb-901a794a977d.JPG)
