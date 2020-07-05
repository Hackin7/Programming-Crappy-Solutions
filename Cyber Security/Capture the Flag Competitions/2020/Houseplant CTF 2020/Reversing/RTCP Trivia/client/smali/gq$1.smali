.class final Lgq$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgq;->a(Landroid/view/View;Lgo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgo;


# direct methods
.method constructor <init>(Lgo;)V
    .locals 0

    iput-object p1, p0, Lgq$1;->a:Lgo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 1

    invoke-static {p2}, Lgx;->a(Ljava/lang/Object;)Lgx;

    move-result-object p2

    iget-object v0, p0, Lgq$1;->a:Lgo;

    invoke-interface {v0, p1, p2}, Lgo;->a(Landroid/view/View;Lgx;)Lgx;

    move-result-object p1

    invoke-static {p1}, Lgx;->a(Lgx;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowInsets;

    return-object p1
.end method
