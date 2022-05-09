## Unit тесты

### Использование JUnit

Подключена зависимость Maven сборки в pom.xml:

```
<dependency>
    <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.2</version>
    <scope>test</scope>
</dependency>
```

Для тестов был создан класс `CubeCalculator`, задача которого посчитать стороны куба.
В этом классе были созданы методы: 
```java
public static int calculateBySide(int side) {
    ...
}
```
который считает площадь куба по стороне
```java
public static int calculateByDiagonal(int side) {
    ...
}
```
по диагонали куба
```java
public static int calculateByPerimeter(int side) {
    ...
}
```
по периметру куба

в папке для тестов `src/test/java` создан класс `TestCubeCalculator` с тестами на методы из `CubeCalculator`

Было написано три теста на каждый метод на JUnit 5 и были успешно пройдены.