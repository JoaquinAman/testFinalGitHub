# testFinalGitHub
1. Escribi gradle app y sus tests

2. Lo subi a github

3. Escribi el gradle.yml: hace el build, corre test, job de sonarcloud, job de artifacts, gitleaks y snyk. Unit Test y SonarCloud corren en paralelo, no secuencial

4. En sonarcloud setee el qualitygate

5. Agregue el job de sonarcloud

6. En jfrog cree a mano el local, remoto y virtual. En el virtual inclui el local y el remoto. Set me up y segui los pasos. Me baje el gradle.properties(que tiene las variables de entorno que usa el build.gradle)

7. gitleaks: googleando encontre el job que use.

8. snyk: googleando encontre el job que use.
9. Arregle vulnerabilidades encontradas por sonarCloud(Tests corregidos)
