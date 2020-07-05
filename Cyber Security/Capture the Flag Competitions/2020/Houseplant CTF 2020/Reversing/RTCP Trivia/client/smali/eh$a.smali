.class final Leh$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:Ldx;

.field b:Ldx;

.field c:I

.field d:I

.field e:I


# direct methods
.method public constructor <init>(Ldx;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh$a;->a:Ldx;

    iget-object v0, p1, Ldx;->d:Ldx;

    iput-object v0, p0, Leh$a;->b:Ldx;

    invoke-virtual {p1}, Ldx;->b()I

    move-result v0

    iput v0, p0, Leh$a;->c:I

    iget v0, p1, Ldx;->g:I

    iput v0, p0, Leh$a;->d:I

    iget p1, p1, Ldx;->h:I

    iput p1, p0, Leh$a;->e:I

    return-void
.end method
