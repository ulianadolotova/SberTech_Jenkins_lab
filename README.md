# SberTech_Jenkins_lab

0. Решила проблему остановки sonarqube:
![Jenkins-0](./media/Jenkins-0.png)

1. Поскольку изначально я выбрала базовую установку Jenkins, необходиые плагины (Docker, Allure, Sonarqube) не были установлены. Установила их вручную в настройках плагинов:
![Jenkins-1](./media/Jenkins-1.png)

2. Установка Docker, SonarQube Scanner, Maven:
![Jenkins-2-1](./media/Jenkins-2-1.png)
![Jenkins-2-2](./media/Jenkins-2-2.png)
![Jenkins-2-3](./media/Jenkins-2-3.png)

3. Добавила токен в Sonar и Jenkins:
![Jenkins-3-1](./media/Jenkins-3-1.png)
![Jenkins-3-2](./media/Jenkins-3-2.png)

4. Настроила пайплайн следующим образом:
![Jenkins-4-1](./media/Jenkins-4-1.png)
![Jenkins-4-2](./media/Jenkins-4-2.png)
![Jenkins-4-3](./media/Jenkins-4-3.png)
![Jenkins-4-4](./media/Jenkins-4-4.png)
![Jenkins-4-5](./media/Jenkins-4-5.png)

5. При этом в Sonar видно, что результаты доезжают (пайплайн проходит), но при этом данных покрытия нет.
![Jenkins-5-1](./media/Jenkins-5-1.png)