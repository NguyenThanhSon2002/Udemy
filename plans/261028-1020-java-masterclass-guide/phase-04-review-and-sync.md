# Phase 4: Đồng bộ Mục lục, Sơ đồ Mermaid & Nghiệm thu

## Context Links
- File tài liệu đích: [`Document/Comprehensive_Java_Masterclass_Guide.md`](../../Document/Comprehensive_Java_Masterclass_Guide.md)
- Kế hoạch tổng thể: [`plan.md`](./plan.md)

## Overview
- **Ưu tiên:** P2
- **Trạng thái:** Completed
- **Mô tả:** Đồng bộ hóa Mục lục (TOC), sơ đồ Mermaid Mindmap ở Mục 1, cập nhật thông số metadata đầu file (tổng số 35 bài Coding Exercises), kiểm tra tính toàn vẹn của tất cả các liên kết markdown và format hiển thị.

## Key Insights
- Sơ đồ Mermaid lộ trình học tập (Roadmap) ở Phần 1 cần phản ánh đúng toàn bộ khối kiến thức Part 7 bao gồm cả Kế thừa và Xử lý Chuỗi/StringBuilder để người học có cái nhìn trực quan toàn diện.
- Mục lục cần cập nhật các liên kết neo (anchor links) trỏ chính xác đến các tiểu mục mới: 8.5 đến 8.10.
- Số lượng bài tập chuẩn xác trong repo là 35 bài (Part 5 có 12 bài, Part 6 có 17 bài, Part 7 có 6 bài).

## Requirements
- **Cập nhật Metadata đầu file:**
  - `> Tài liệu nguồn: Toàn bộ Slide thuyết trình (Parts 1–7) & Toàn bộ Mã nguồn dự án (60+ Java files, 35 bài Coding Exercises)`
  - Cập nhật ngày: Ngày hiện tại (28/10/2026).
- **Cập nhật Mục lục (TOC):**
  - Mở rộng mục 8 trong mục lục:
    - 8.1 Class, Object & Encapsulation
    - 8.2 Constructor & Constructor Chaining (`this(...)`)
    - 8.3 Static vs Instance
    - 8.4 POJO vs Modern Java Record
    - 8.5 Kế thừa trong Java & java.lang.Object
    - 8.6 Nạp chồng (Overloading) vs Ghi đè (Overriding)
    - 8.7 Case Study Kế thừa: Quản lý Nhân sự
    - 8.8 Định dạng chuỗi hiện đại & Text Blocks
    - 8.9 Khám phá chuyên sâu chuỗi ký tự (String Deep-Dive)
    - 8.10 Lớp StringBuilder & Tối ưu bộ nhớ
    - Chi tiết 6 bài Coding Exercises (Part 7: Ex 30 – 35)
- **Cập nhật Sơ đồ Mermaid Roadmap (Mục 1):**
  - Cập nhật subgraph `P7` để thể hiện đầy đủ:
    - `P7_1["Classes, Objects & Encapsulation"]`
    - `P7_2["Constructor Chaining: this(...) & super(...)"]`
    - `P7_3["Static vs Instance & java.lang.Object"]`
    - `P7_4["POJO vs Modern Record"]`
    - `P7_5["Inheritance & Overriding vs Overloading"]`
    - `P7_6["Text Blocks, String Deep-Dive & StringBuilder"]`
    - `P7_7["6 Coding Exercises (Ex 30 - 35)"]`
- **Rà soát chất lượng & Kiểm tra liên kết:**
  - Toàn bộ link file mã nguồn phải sử dụng URL scheme chuẩn hoặc link nội bộ.
  - Căn lề các bảng so sánh ngay ngắn, rõ ràng.

## Implementation Steps
1. Đọc và chỉnh sửa phần Header và Mục lục ở đầu file `Comprehensive_Java_Masterclass_Guide.md`.
2. Thay thế khối Mermaid `subgraph P7` bằng cấu trúc mới.
3. Rà soát lại toàn bộ file từ đầu đến cuối để đảm bảo không bị lỗi cú pháp markdown hoặc ngắt quãng logic.

## Todo List
- [x] Cập nhật Metadata đầu trang (35 bài tập, ngày 28/10/2026)
- [x] Cập nhật Mục lục đầy đủ các mục 8.1 - 8.10 và bài tập
- [x] Nâng cấp sơ đồ Mermaid Roadmap tại Mục 1
- [x] Rà soát tính toàn vẹn markdown toàn bộ file

## Success Criteria
- File markdown render hoàn hảo, không có thẻ hoặc khối code bị vỡ.
- Các liên kết neo trong Mục lục trỏ chính xác đến các heading tương ứng.
- Metadata và sơ đồ Roadmap khớp 100% với nội dung thực tế của cẩm nang.
