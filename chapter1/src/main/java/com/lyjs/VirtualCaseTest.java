package com.lyjs;

public class VirtualCaseTest {

    static class father{

        public void f(){
            System.out.println("father");
        }

        public static void print(){
            System.out.println("father 的静态方法");
        }
    }

    /**
     * special和static都是非虚方法
     *
     * virtual和interface一般都是虚方法
     */

    static class son extends father{

        public void s(){
            //invokevirtual
            this.f();
            //invokespecial
            /**
             * invokespecial 指令用于调用一些特殊的方法，
             * 比如实例初始化方法（构造函数）、私有方法和父类的方法。
             */
            super.f();
            //invokevirtual
            e();
            /**
             *
             * 即便在当前类中调用自身的方法，也需要考虑到多态的情况。
             * 因为当前类可能会被其他类继承，并且子类可能会重写这个方法。
             * 使用 invokevirtual 指令可以保证在运行时能够根据对象的实际类型来调用正确的方法。
             *
             * 因为有可能别的类继承son类，然后重写e方法，如果方法回调s的话会调用重写后的e
             *
             */
            System.out.println("son");
            //invokestatic
            print();
        }

        public void e(){
            System.out.println("原生的e");
        }
    }


    static interface lam{
        void p();
    }

    public static void main(String[] args) {

        son s=new son(){
            @Override
            public void e() {
                System.out.println("重写后的e");
            }
        };
        s.s();
        /**
         * 输出如下
         * father
         * father
         * 重写后的e
         * son
         *
         */

    }

}
