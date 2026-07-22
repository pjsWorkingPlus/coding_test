# 패키지
```java
//java.util
import java.util.Scanner;
import java.util.StringTokenizer;
//선형자료구조
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Stack;
import java.util.Arrays;
//큐, 해시
import java.util.PriorityQueue;
import java.util.HashMap;
import java.HashSet;

//java.io
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//java.lang (컴파일러가 자동으로 부름)
import java.lang.System.out;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Math;
// 기타 래퍼 클래스 캐스팅


```


# 입출력
## 입력
### scanner
```java
Scanner sc = new Scanner(System.in);

```
### BufferedReader
```java


BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
// 한줄 읽기
String input = br.readLine();
// 단일 타입 읽기
int n = Integer.parseInt(br.readLine());

// 한줄 공백 구분
StringTokenizer st = new StringTokenizer(br.readline());
int a = Integer.parseInt(st.nextToken());

```
## 출력
