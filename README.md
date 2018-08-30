# Docker with SpringBoot, tomcat and MySQL<br>
## How to run this demo?<br>
### Step 0 - Requirements
Here are the tools you need:<br>
> 1. Docker (duh)<br>
> 2. Eclipse (I'm using Eclipse Photon)<br>
### Step 1 - Clone this repo
```git clone https://github.com/HechengLi/Docker_SpringBoot_Tomcat_MySQL.git```
### Step 2 - Import TianMiao into eclipse as a maven project
> Open your eclipse<br>
> On the taskbar click File -> Import -> Maven -> Existing Maven Project<br>
> Select the folder TianMiao the Root Directory (You should see /pom.xml com.example:TianMiao:0.0.1-SNAPSHOT:war in Projects)<br>
> Click Finish
### Step 3 - Build TianMiao as a war file
> Right click TianMiao in Package Explorer -> Run As -> Run Configurations<br>
> Type 'clean install -Dmaven.test.skip=true' in Goals<br>
> Click Apply then Run (you should have TianMiao.war under Docker_SpringBoot_Tomcat_MySQL\TianMiao\target)
### Step 4 - Run the project with docker
> Open your commandline, cd to the git directory<br>
> Make sure you have docker app running<br>
> Run 'docker-compose -f stack.yml up' (add -d if you want it to run in background)<br>
### Step 5 - Rerun if there's an error on first run
> If you get an error while starting tomcat, it probably is because the docker container running Tomcat doesn't wait for MySQL to finish running it's setup script.<br>
> Stop all containers and start again should fix the problem.
### Step 6 - Check if it works (suggestion - use postman)
> Send Get Request to 'http://localhost:8080/TianMiao/api/users' to retrive data<br>
> Send Post Request to 'http://localhost:8080/TianMiao/api/users' with json {'username': 'anyusername'} to add data
