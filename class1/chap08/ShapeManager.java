package com.whoo.chap08;

public class ShapeManager {
        private Shape[] shapes = new Shape[10];
        private int index;



        public void addShape(Shape shape) {
                shapes[index++] = shape;
        }

        public void removeShape(Shape shape) {
            /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
                for (int i = 0; i < index; i++) {
                        if (shapes[i].equals(shape)) {
                                for(int j = 0 ; j < index ; j++){
                                        shapes[j] = shapes[j+1];
                                }
                                shapes[index-1] = null;
                                index--;
                                break;
                        }
                }
        }

        public void printAllShapes() {
            /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
                for (int i = 0; i < index ; i++) {
                        System.out.println(shapes[i].calculateArea());
                        System.out.println(shapes[i].calculatePerimeter());
                }
        }

        public double getTotalArea() {
            /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
                double total = 0;
                for (int i = 0; i < index ; i++) {
                        total += shapes[i].calculateArea();
                }
                return total;
        }

        public double getTotalPerimeter() {
            /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
                double total = 0;
                for (int i = 0; i < index ; i++) {
                        total += shapes[i].calculatePerimeter();
                }
                return total;
        }
}
