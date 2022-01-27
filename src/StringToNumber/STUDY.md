# 1. 문자열 치환
## Replace

```
String replace(CharSequence target, CharSequence replacement)
```

> target 문자(문자열)을 replacement 문자(문자열)로 치환<br>
> ```
> String s = "abcd";
> s = s.replace("ab", "cd");
> ```

# 2. String과 int 형변환
## String to int
```
static int parseInt(String s)
```
> s 문자열을 integer로 변환한 int 값 리턴<br>
> ```
> int intValue = Integer.parseInt(s);
> ```

## int to String
```
String toString(int i)
```
> 정수 i를 String으로 변환한 String 값 리턴<br>
> ```
> String s = Integer.toString(i);
> ```
