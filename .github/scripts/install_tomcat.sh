cd /tmp
mkdir -p /opt/tomcat
echo "=== downloading ==="
curl -O https://www-us.apache.org/dist/tomcat/tomcat-10/v10.0.5/bin/apache-tomcat-10.0.5.tar.gz
ls -l /tmp
echo "=== unzipping ==="
tar xzvf /tmp/apache-tomcat-10.0.5.tar.gz -C /opt/tomcat --strip-components=1
