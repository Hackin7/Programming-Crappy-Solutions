.class public final Lez$d;
.super Ljava/lang/Object;

# interfaces
.implements Lez$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final a:Lfv;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Lfv;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lez$d;->a:Lfv;

    iput p2, p0, Lez$d;->c:I

    iput p3, p0, Lez$d;->b:I

    return-void
.end method
