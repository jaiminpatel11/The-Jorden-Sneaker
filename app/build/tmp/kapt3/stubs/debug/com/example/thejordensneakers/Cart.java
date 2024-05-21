package com.example.thejordensneakers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/thejordensneakers/Cart;", "", "()V", "products", "", "Lcom/example/thejordensneakers/Product;", "getProducts", "()Ljava/util/List;", "addToCart", "", "product", "removeFromCart", "Companion", "app_debug"})
public final class Cart {
    @org.jetbrains.annotations.Nullable
    private static com.example.thejordensneakers.Cart instance;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.thejordensneakers.Product> products = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.thejordensneakers.Cart.Companion Companion = null;
    
    private Cart() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.thejordensneakers.Product> getProducts() {
        return null;
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull
    com.example.thejordensneakers.Product product) {
    }
    
    public final void removeFromCart(@org.jetbrains.annotations.NotNull
    com.example.thejordensneakers.Product product) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/thejordensneakers/Cart$Companion;", "", "()V", "instance", "Lcom/example/thejordensneakers/Cart;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Synchronized
        @org.jetbrains.annotations.NotNull
        public final synchronized com.example.thejordensneakers.Cart getInstance() {
            return null;
        }
    }
}