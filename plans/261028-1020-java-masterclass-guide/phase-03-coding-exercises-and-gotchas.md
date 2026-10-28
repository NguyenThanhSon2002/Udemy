# Phase 3: Bổ sung Coding Exercises & Bẫy kinh điển

## Context Links
- Mã nguồn bài tập:
  - [`P7-Challenge/ExCoding34`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/P7-Challenge/ExCoding34/src/Floor.java) (`Floor.java`, `Carpet.java`, `Calculator.java`)
  - [`P7-Challenge/ExCoding35`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/P7-Challenge/ExCoding35/src/ComplexNumber.java) (`ComplexNumber.java`)
- File tài liệu đích: [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)

## Overview
- **Ưu tiên:** P1
- **Trạng thái:** Completed
- **Mô tả:** Mở rộng bảng bài tập thực hành của Part 7 từ 4 bài lên 6 bài bằng cách bổ sung chi tiết bài Ex 34 và Ex 35. Mở rộng mục 9 (Bẫy kinh điển) với 5 bẫy sống còn mới về OOP Kế thừa, Đa hình và Thao tác Chuỗi trong Java.

## Key Insights
- Ex 34 là bài tập kinh điển về kết hợp (Composition / Aggregation) giữa nhiều đối tượng: `Floor` (quản lý kích thước và diện tích sàn), `Carpet` (quản lý đơn giá thảm) và `Calculator` (kết hợp Floor và Carpet để tính tổng chi phí). Cần validate số âm về 0.
- Ex 35 mô hình hóa kiểu dữ liệu trừu tượng số phức (`ComplexNumber`) với các phép toán `+`, `-` thông qua nạp chồng phương thức `add(double, double)` và `add(ComplexNumber)`.
- Các bẫy về kế thừa và chuỗi thường xuất hiện trong các bài phỏng vấn Java Core (ví dụ: thứ tự khởi tạo cha trước con sau, gọi hàm bị ghi đè trong constructor, ghép chuỗi trong vòng lặp).

## Requirements
- **Bổ sung vào bảng Coding Exercises Part 7:**
  - Đổi tiêu đề thành: `Chi tiết 6 bài Coding Exercises (Part 7: Ex 30 – 35)`.
  - Thêm hàng **Ex 34**: **Carpet Cost Calculator** (`Floor`, `Carpet`, `Calculator`):
    - Thuộc tính: `Floor` (`width`, `length`), `Carpet` (`cost`), `Calculator` (`floor`, `carpet`).
    - Logic validate: Nếu kích thước hoặc đơn giá < 0 thì tự gán về 0.
    - Phương thức: `getCost()` của `Carpet`, `getArea()` của `Floor`, `getTotalCost()` của `Calculator`.
    - Link file mã nguồn: [`Floor.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/P7-Challenge/ExCoding34/src/Floor.java).
  - Thêm hàng **Ex 35**: **Complex Operations (Số phức)** (`ComplexNumber`):
    - Thuộc tính: `real` (double), `imaginary` (double).
    - Getters: `getReal()`, `getImaginary()`.
    - Phép cộng: `add(double real, double imaginary)` và `add(ComplexNumber complexNumber)`.
    - Phép trừ: `subtract(double real, double imaginary)` và `subtract(ComplexNumber complexNumber)`.
    - Link file mã nguồn: [`ComplexNumber.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/P7-Challenge/ExCoding35/src/ComplexNumber.java).
- **Mở rộng Bảng Mục 9 (Bẫy kinh điển & Best Practices):**
  - Thêm STT 8: **Thứ tự chạy Constructor trong kế thừa & Gọi overridable method**.
  - Thêm STT 9: **Thu hẹp phạm vi truy cập (Access Modifier) khi Override**.
  - Thêm STT 10: **Ghép chuỗi bằng `+` trong vòng lặp lớn**.
  - Thêm STT 11: **Phân biệt `isEmpty()` vs `isBlank()`**.
  - Thêm STT 12: **Biến không có tính đa hình (Shadowing Variable thay vì Overriding)**.

## Related Code Files
- **Sửa đổi:** [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)

## Implementation Steps
1. Cập nhật bảng Coding Exercises Part 7 với Ex 34 và Ex 35.
2. Mở rộng bảng mục 9 với 5 hàng từ STT 8 đến 12.
3. Rà soát liên kết mã nguồn và bảng markdown đảm bảo căn lề chuẩn xác.

## Todo List
- [x] Cập nhật bảng Coding Exercises Part 7 (thêm Ex 34, Ex 35)
- [x] Bổ sung Bẫy 8: Constructor initialization order & overridable call
- [x] Bẫy 9: Access modifier restriction in Overriding
- [x] Bẫy 10: String concatenation in loops vs StringBuilder
- [x] Bẫy 11: String isEmpty() vs isBlank()
- [x] Bẫy 12: Field shadowing vs method overriding

## Success Criteria
- Đủ 6 bài Coding Exercises cho Part 7.
- Mục Bẫy kinh điển đạt 12 bẫy bao quát đầy đủ từ kiểu dữ liệu, vòng lặp, Scanner đến Kế thừa và Chuỗi.

## Next Steps
- Chuyển sang Phase 4 để đồng bộ Mục lục, Mindmap Mermaid và rà soát toàn bộ tài liệu.
