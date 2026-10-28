# Phase 1: Kế thừa & Lớp java.lang.Object

## Context Links
- Slide bài giảng: Slides 91–98 (`Part7 - Mastering Java OOP - Classes & Inheritance/Document/`)
- Mã nguồn mẫu:
  - [`Dog.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/Inheritance/src/Dog.java) & [`Animal.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/Inheritance/src/Animal.java)
  - [`TheObjectClass/src/Main.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/TheObjectClass/src/Main.java)
  - [`InheritanceChallenge`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/InheritanceChallenge/src/SalariedEmployee.java)
- File tài liệu đích: [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)

## Overview
- **Ưu tiên:** P1
- **Trạng thái:** Completed
- **Mô tả:** Soạn thảo và tích hợp các mục 8.5, 8.6, 8.7 vào Part 7 của tài liệu ôn tập. Tập trung làm rõ cơ chế kế thừa, constructor chaining đa tầng với `super(...)`, vai trò của lớp `java.lang.Object`, bảng đối chiếu chi tiết Overloading vs Overriding và case study hệ thống tính lương nhân sự.

## Key Insights
- Kế thừa trong Java chỉ hỗ trợ đơn kế thừa lớp (Single Inheritance). Mọi lớp đều kế thừa ngầm định từ `java.lang.Object`.
- Lệnh gọi `super(...)` phải là dòng đầu tiên trong constructor con nếu muốn truyền tham số lên cha. Nếu không gọi rõ, JVM ngầm định chèn `super();`.
- Khác biệt căn bản giữa Overloading (Compile-time polymorphism) và Overriding (Runtime polymorphism / Dynamic Dispatch).
- Overriding phải tuân thủ nghiêm ngặt quy tắc Covariant Return Type và không được thu hẹp Access Modifier.

## Requirements
- Viết mục **8.5. Kế thừa trong Java (Inheritance) & Lớp cơ sở `java.lang.Object` (Slides 91 – 94, 97)**:
  - Định nghĩa, quan hệ IS-A, cú pháp `extends`.
  - Cơ chế khởi tạo constructor con - cha, `super(...)` vs `this(...)`.
  - Giới thiệu `java.lang.Object`, các phương thức cốt lõi (`toString()`, `equals()`, `hashCode()`, `getClass()`).
  - Trích xuất code minh họa từ `Animal`/`Dog` và `Student`/`PrimarySchoolStudent`.
- Viết mục **8.6. Bảng Đối chiếu: Nạp chồng (Overloading) vs Ghi đè (Overriding) (Slide 98)**:
  - Bảng so sánh 8 tiêu chí chuẩn mực.
  - Phân tích vai trò annotation `@Override`.
- Viết mục **8.7. Case Study Kế thừa: Hệ thống Quản lý Nhân sự (Slides 95 – 96)**:
  - Phân tích kiến trúc phân cấp: `Worker` -> `Employee` -> `SalariedEmployee` & `HourlyEmployee`.
  - Code mẫu tính lương `collectPay()` có logic trừ lương hưu hoặc tăng ca.

## Related Code Files
- **Sửa đổi:** [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)

## Implementation Steps
1. Xác định vị trí chèn sau mục 8.4 (dòng 358 trong file guide hiện tại).
2. Viết nội dung mục 8.5 với cấu trúc chuẩn: Khái niệm -> Quy tắc kỹ thuật -> Code block minh họa.
3. Soạn thảo bảng markdown so sánh 8 tiêu chí cho mục 8.6.
4. Trình bày bài toán thực tế và trích xuất mã nguồn mẫu cho mục 8.7.
5. Kiểm tra tính toàn vẹn markdown và các liên kết file github-style.

## Todo List
- [x] Soạn thảo mục 8.5: Kế thừa & java.lang.Object
- [x] Soạn thảo mục 8.6: Bảng so sánh Overloading vs Overriding
- [x] Soạn thảo mục 8.7: Case study Worker / Employee
- [x] Cập nhật liên kết mã nguồn chuẩn xác

## Success Criteria
- Nội dung giải thích chính xác, mạch lạc, chuẩn kỹ thuật Java 17.
- Có code minh họa thực tế từ repo thay vì code giả định.
- Bảng so sánh rõ ràng, bao quát cả access modifier, return type và exception.

## Risk Assessment & Mitigation
- **Rủi ro:** Trùng lặp nội dung với Part 5 (vốn đã nhắc đến Overloading).
- **Giải pháp:** Tập trung vào sự đối chiếu với Overriding trong ngữ cảnh kế thừa OOP và đa hình tại thời điểm runtime.

## Next Steps
- Chuyển sang Phase 2 để bổ sung Text Blocks, String và StringBuilder.
