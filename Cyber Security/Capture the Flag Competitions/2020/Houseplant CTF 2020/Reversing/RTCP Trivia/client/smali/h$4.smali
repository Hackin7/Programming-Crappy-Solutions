.class final Lh$4;
.super Ljava/lang/Object;

# interfaces
.implements Lcd$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh;


# direct methods
.method constructor <init>(Lh;)V
    .locals 0

    iput-object p1, p0, Lh$4;->a:Lh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, Lh$4;->a:Lh;

    iget v1, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0, v1}, Lh;->g(I)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    return-void
.end method
