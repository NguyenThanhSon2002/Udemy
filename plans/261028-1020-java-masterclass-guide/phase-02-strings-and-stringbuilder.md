# Phase 2: Cú pháp Chuỗi hiện đại & StringBuilder

## Context Links
- Slide bài giảng: Slides 99–102 (`Part7 - Mastering Java OOP - Classes & Inheritance/Document/`)
- Mã nguồn mẫu:
  - [`StringFormatting/src/Main.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/StringFormatting/src/Main.java)
  - [`AllAboutStrings/src/Main.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/AllAboutStrings/src/Main.java)
  - [`AllAboutStrings/src/StringMethods.java`](../../Part7%20-%20Mastering%20Java%20OOP%20-%20Classes%20&%20Inheritance/Code/AllAboutStrings/src/StringMethods.java)
- File tài liệu đích: [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)

## Overview
- **Ưu tiên:** P1
- **Trạng thái:** Completed
- **Mô tả:** Soạn thảo và tích hợp các mục 8.8, 8.9, 8.10 vào Part 7 của tài liệu ôn tập. Tập trung vào tính năng hiện đại Text Blocks của Java 15+, hệ thống định dạng chuỗi, bản chất Immutability và bộ hàm String manipulation, kết thúc bằng giải pháp tối ưu hóa hiệu năng với `StringBuilder`.

## Key Insights
- `String` trong Java là bất biến (Immutable). Mọi thao tác biến đổi chuỗi đều tạo một đối tượng mới trong Heap / String Constant Pool.
- Ghép chuỗi bằng `+` trong vòng lặp lặp lại nhiều lần làm phát sinh $O(N^2)$ chi phí sao chép bộ nhớ và kích hoạt GC liên tục.
- `StringBuilder` cung cấp buffer khả biến (Mutable), tối ưu hóa tốc độ và giảm áp lực bộ nhớ.
- Java 15 Text Blocks (`"""`) giải quyết triệt để vấn đề format chuỗi nhiều dòng mà không cần nối chuỗi hay chèn `\n` thủ công.

## Requirements
- Viết mục **8.8. Định dạng chuỗi hiện đại & Text Blocks (Java 15+) (Slide 99 & StringFormatting)**:
  - Cú pháp `"""`, cơ chế căn lề tự động (strip indentation).
  - So sánh chuỗi truyền thống nối `\t\n` vs Text Blocks.
  - Các công cụ format: `System.out.printf()`, `String.format()`, `"template".formatted(args)`.
  - Bảng tra cứu Specifiers: `%d`, `%f`, `%.2f`, `%s`, `%c`, `%b`, `%n`, `%6d`.
- Viết mục **8.9. Khám phá chuyên sâu chuỗi ký tự (String Deep-Dive) (Slides 100 – 101 & AllAboutStrings)**:
  - Cơ chế String Pool & Immutability.
  - Nhóm hàm kiểm tra (Inspection): `length()`, `charAt()`, `indexOf()`, `lastIndexOf()`, `isEmpty()` vs `isBlank()`.
  - Nhóm hàm so sánh: `equals()`, `equalsIgnoreCase()`, `startsWith()`, `endsWith()`, `contains()`, `contentEquals()`.
  - Nhóm hàm biến đổi (Manipulation): `substring()`, `toLowerCase()`, `toUpperCase()`, `concat()`, `String.join()`, `replace()`, `strip()`, `indent()`, `repeat()`.
- Viết mục **8.10. Lớp `StringBuilder` – Giải pháp tối ưu hóa hiệu năng (Slide 102)**:
  - So sánh `String` vs `StringBuilder` (Immutable vs Mutable, Thread-safety context với `StringBuffer`).
  - Các phương thức trọng yếu: `append()`, `insert()`, `delete()`, `deleteCharAt()`, `reverse()`, `setLength()`, `capacity()`.
  - Minh họa trực quan vòng lặp ghép chuỗi và lý do chọn `StringBuilder`.

## Related Code Files
- **Sửa đổi:** [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)

## Implementation Steps
1. Soạn thảo mục 8.8 kèm code minh họa từ `StringFormatting/Main.java`.
2. Tạo bảng tra cứu Format Specifiers đầy đủ ví dụ.
3. Soạn thảo mục 8.9 phân loại rõ ràng 3 nhóm hàm String kèm ví dụ thực tế từ `AllAboutStrings`.
4. Soạn thảo mục 8.10 phân tích chi tiết cơ chế bộ đệm của `StringBuilder` và các method thông dụng.
5. Kiểm tra định dạng markdown và code blocks.

## Todo List
- [x] Soạn thảo mục 8.8: Text Blocks & String Formatting
- [x] Soạn thảo mục 8.9: String Inspection & Manipulation Deep-Dive
- [x] Soạn thảo mục 8.10: StringBuilder & Phân tích hiệu năng bộ nhớ
- [x] Rà soát tính chính xác của các đoạn code mẫu

## Success Criteria
- Lý thuyết Text Blocks và String Methods được trình bày rõ ràng, dễ nhớ để ôn thi/phỏng vấn.
- Nêu bật được sự khác biệt giữa `isEmpty()` và `isBlank()` (tính năng từ Java 11).
- Minh họa rõ ràng sự khác biệt về cơ chế bộ nhớ giữa `String` và `StringBuilder`.

## Next Steps
- Chuyển sang Phase 3 để cập nhật Coding Exercises Ex 34–35 và mở rộng mục Bẫy kinh điển.
