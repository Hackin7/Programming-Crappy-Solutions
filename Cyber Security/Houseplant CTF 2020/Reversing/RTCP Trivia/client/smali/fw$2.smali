.class final Lfw$2;
.super Ljava/lang/Object;

# interfaces
.implements Lfx$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfw;->a(Landroid/content/Context;Lfv;Lfc$a;ZII)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lfx$a<",
        "Lfw$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lfc$a;

.field final synthetic b:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lfc$a;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lfw$2;->a:Lfc$a;

    const/4 p1, 0x0

    iput-object p1, p0, Lfw$2;->b:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lfw$c;

    if-nez p1, :cond_0

    iget-object p1, p0, Lfw$2;->a:Lfc$a;

    const/4 v0, 0x1

    iget-object v1, p0, Lfw$2;->b:Landroid/os/Handler;

    invoke-virtual {p1, v0, v1}, Lfc$a;->a(ILandroid/os/Handler;)V

    return-void

    :cond_0
    iget v0, p1, Lfw$c;->b:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lfw$2;->a:Lfc$a;

    iget-object p1, p1, Lfw$c;->a:Landroid/graphics/Typeface;

    iget-object v1, p0, Lfw$2;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, v1}, Lfc$a;->a(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    return-void

    :cond_1
    iget-object v0, p0, Lfw$2;->a:Lfc$a;

    iget p1, p1, Lfw$c;->b:I

    iget-object v1, p0, Lfw$2;->b:Landroid/os/Handler;

    invoke-virtual {v0, p1, v1}, Lfc$a;->a(ILandroid/os/Handler;)V

    return-void
.end method
