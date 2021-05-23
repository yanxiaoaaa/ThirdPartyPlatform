# 前端内容启动及部署
## 1、前端部署打包命令
```shell
    npm run build
```
## 2、生成dist目标文件夹
    将文件夹上传到服务器nginx映射地址
    安装docker-compose 插件
        通过文件./nginx.conf ./docker-compose.yml 进行配置部署
        ps:需要根据自己的需求自行修改相关配置内容    
    主要命令为
            docker-compose up -d
            docker-compose down

# 后端内容及部署
## 1、部署数据库内容
    存储部分为mysql内的sql文件
    建议部署mysql的docker容器，便于隔离数据
    需要将mysql容器名与后续的部署shell对应起来
## 2、maven package打包
    通过maven打包的形式进行docker文件生成
主要代码
```
<--! maven dokcer部署插件 -->
<plugin>
    <groupId>com.spotify</groupId>
    <artifactId>docker-maven-plugin</artifactId>
    <version>1.1.0</version>
    <executions>
        <execution>
            <id>build-image</id>
            <phase>package</phase>
            <goals>
                <goal>build</goal>
            </goals>
        </execution>
    </executions>
    <configuration>
        <imageName>science/${project.artifactId}:${project.version}</imageName>
        <--! 服务器地址修改部分 -->
        <dockerHost>http://10.112.14.63:2375</dockerHost>
        <baseImage>java:8</baseImage>
        <entryPoint>["java", "-jar", "-Dspring.profiles.active=prod","/${project.build.finalName}.jar"]</entryPoint>
        <resources>
            <resource>
                <targetPath>/</targetPath>
                <directory>${project.build.directory}</directory>
                <include>${project.build.finalName}.jar</include>
            </resource>
        </resources>
    </configuration>
</plugin>
```
## 3、启动镜像脚本
```shell
# 此处的[science-mysql]:[db]是将 mysql容器的名字与 springboot容器内依赖的db 映射好
# -p [本机服务器端口]:[容器内部端口]
    docker run -p 9870:9870 --name resource \
    --link science-mysql:db \
    -d science/resource:1.0
```