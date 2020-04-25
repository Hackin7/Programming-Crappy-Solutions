.class public final Lez$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IZLjava/lang/String;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lez$c;->a:Ljava/lang/String;

    iput p2, p0, Lez$c;->b:I

    iput-boolean p3, p0, Lez$c;->c:Z

    iput-object p4, p0, Lez$c;->d:Ljava/lang/String;

    iput p5, p0, Lez$c;->e:I

    iput p6, p0, Lez$c;->f:I

    return-void
.end method
