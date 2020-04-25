.class final Lfw$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


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
        "Ljava/util/concurrent/Callable<",
        "Lfw$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lfv;

.field final synthetic c:I

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lfv;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfw$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lfw$1;->b:Lfv;

    iput p3, p0, Lfw$1;->c:I

    iput-object p4, p0, Lfw$1;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lfw$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lfw$1;->b:Lfv;

    iget v2, p0, Lfw$1;->c:I

    invoke-static {v0, v1, v2}, Lfw;->a(Landroid/content/Context;Lfv;I)Lfw$c;

    move-result-object v0

    iget-object v1, v0, Lfw$c;->a:Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    sget-object v1, Lfw;->a:Ldi;

    iget-object v2, p0, Lfw$1;->d:Ljava/lang/String;

    iget-object v3, v0, Lfw$c;->a:Landroid/graphics/Typeface;

    invoke-virtual {v1, v2, v3}, Ldi;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
