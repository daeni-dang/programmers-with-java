# 1. ArrayList

```
import java.util.ArrayList;
```
### ArrayList 생성
```
ArrayList<자료형> 이름 = new ArrayList<>();
```
> "자료형"의 자료를 저장하기 위한 가변의 배열 공간 생성

### element 추가
```
이름.add("추가할 원소");
```
### element 삭제
```
이름.remove("삭제할 원소의 인덱스 혹은 원소");
```
### element 값 조회
```
이름.get(인덱스);
```

# 2. HashMap
### HashMap 생성
```
HashMap<key의 자료형, value의 자료형> 이름 = new HashMap<>();
```
> key와 value를 각각의 자료형에 맞는 자료를 key가 중복되지 않게 저장할 수 있는 map 공간 생성

### 값 추가
```
이름.put("key", "value");
```
### 값 제거
```
이름.remove("key");
```

### 값 조회
```
이름.get("key");
```
