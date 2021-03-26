### Mockito

`Mockito` นั้นเป็น Framework ที่ใช้ในการเขียน Unit Test ของ Java

#### Installation

โดยในการเรียกใช้ `Mockito` ของ `Maven` เราต้องใส่ dependency ต่อไปนี้

1. Library ของ `Mockito`

```markdown
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>3.8.0</version>
    </dependency>
```

2. Library ของ `Junit` ในที่นี้ผมใช้เป็น `Junit4`

```markdown
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>
```

จากนั้นทำการใส่ annotation นี้ใน class test `@RunWith(MockitoJUnitRunner.class)` ในกรณีที่ใช้ `Junit5`
ต้องใช้ `@ExtendWith` แทน

#### Knowledge Sharing

หลักการในการเขียน Test นั้นจะทำตามหลัก 3A คือ

1. `Arrange` (เตรียมข้อมูล หรือ mock นั่นเอง)
2. `Act` (การรันการทำงานที่เราจะ Test)
3. `Assert`(การตรวจสอบผลลัพธ์ว่าตรงตามที่เราต้องการหรือไม่)

- สำหรับ`Mockito`การที่จะ Mock class นั้นสามารถทำได้โดยใส่ `@Mock` ส่วนตัวที่เราต้องการให้เรียกใช้ Mock
  นี้ให้ใส่ `@InjectMocks` นอกจากนี้หากเราต้องการ Stub ในส่วนของ class ที่ใช้ Test เราสามารถทำได้โดยใช้ `@Spy`


- `when(method()).thenReturn()` ต่างจาก `doReturn().when().method()` โดยการเขียน Test โดยวิธีแรกจะเป็น type check
  คือมีการตรวจสอบ type ของค่าที่ return ค่อนข้างแนะนำให้ใช้วิธีนี้เพื่อตรวจสอบด้วยว่าเราใส่ค่าถูกไหม
  ส่วนอีกวิธีจะไม่เป็น type check แต่จะถูกใช้ในกรณีของ `Spy` หรือกรณีที่ต้อง Stub void method

- `@Captor` ไว้ใช้ในการ verify ดู argument ที่ใช้ในการเรียก method ว่าถูกต้องหรือไม่


- กรณีที่ต้องการ inject mock เข้าไปใน spy นั้นไม่สามารถทำได้ต้องสร้าง spy และ inject ผ่าน constructor แทนดังนี้

```java
@Mock
Map<String, String> wordMap;

        MyDictionary spyDic;

@Before
public void init(){
        MockitoAnnotations.initMocks(this);
        spyDic=Mockito.spy(new MyDictionary(wordMap));
        }
```

- function Argument Matcher คือการที่เราไม่ต้องการกำหนดว่าถ้า method ถูกเรียกด้วย argument นี้ถึงจะ return แบบนี้
  โดยเราสามารถใช้ argument matcher ช่วยได้เช่น `when(a.method(1,2)).thenReturn()`
  สามารถใช้แทนโดย `when(a.method(anyInt(),anyInt())).thenReturn()`
  โดยกรณีที่มี field ใดใช้ argument matcher แล้วไม่สามารถ set อีก field ด้วย raw value
  ได้ `//Incorrect when(a.method(1,anyInt())).thenReturn()`


- การจะเลือกใช้ argument matcher หรือ argument captor ขึ้นอยู่กับว่าเราต้องการตรวจสอบ argument ของ method รึเปล่า


- ใน `Mockito version 2` ในกรณีที่ใช้ optional หรือ stream แล้วกำหนดให้ return empty เราสามารถ ignore line นั้นในการ
  stub ได้
  `when(jobService.findCurrentJobPosition(any(Person.class))).thenReturn(Optional.empty());`


- การเขียน integration test ใน Spring Boot นั้นจะใช้ `@RunWith(SpringRunner.class)` โดยจะใช้ `@MockBean`
  กับ `@Autowired` ในการ test โดยตัว `@MockBean` จะทำการตรวจสอบว่า ใน Application Context นั้นมี instance
  อยู่แล้วหรือไม่หากไม่จะทำการสร้างและเก็บใส่ context


- การเขียน integration test ในส่วนของ Rest template สามารถใช้ `MockRestServiceServer`  ในการช่วย mock server ได้คือ
  สามารถสร้าง server ที่จะ return object เมื่อมีการส่ง request ผ่าน rest template ได้ ซึ่งช่วยให้เราเขียน test ในส่วนของ
  rest template ได้ง่ายขึึ้น
          




 