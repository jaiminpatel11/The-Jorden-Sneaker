package com.example.thejordensneakers;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/example/thejordensneakers/ProductAdapter;", "Lcom/firebase/ui/database/FirebaseRecyclerAdapter;", "Lcom/example/thejordensneakers/Product;", "Lcom/example/thejordensneakers/ProductAdapter$MyViewHolder;", "options", "Lcom/firebase/ui/database/FirebaseRecyclerOptions;", "(Lcom/firebase/ui/database/FirebaseRecyclerOptions;)V", "onBindViewHolder", "", "holder", "position", "", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "app_debug"})
public final class ProductAdapter extends com.firebase.ui.database.FirebaseRecyclerAdapter<com.example.thejordensneakers.Product, com.example.thejordensneakers.ProductAdapter.MyViewHolder> {
    
    public ProductAdapter(@org.jetbrains.annotations.NotNull
    com.firebase.ui.database.FirebaseRecyclerOptions<com.example.thejordensneakers.Product> options) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.thejordensneakers.ProductAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.thejordensneakers.ProductAdapter.MyViewHolder holder, int position, @org.jetbrains.annotations.NotNull
    com.example.thejordensneakers.Product model) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/example/thejordensneakers/ProductAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V", "ShoesName", "Landroid/widget/TextView;", "getShoesName", "()Landroid/widget/TextView;", "ShoesPrice", "getShoesPrice", "imgShoes", "Landroid/widget/ImageView;", "getImgShoes", "()Landroid/widget/ImageView;", "app_debug"})
    public static final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView ShoesName = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView ShoesPrice = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView imgShoes = null;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull
        android.view.LayoutInflater inflater, @org.jetbrains.annotations.NotNull
        android.view.ViewGroup parent) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getShoesName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getShoesPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getImgShoes() {
            return null;
        }
    }
}